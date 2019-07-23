package io.github.cottonmc.cotton.gui.widget;

import io.github.cottonmc.cotton.gui.client.BackgroundPainter;
import io.github.cottonmc.cotton.gui.client.LibGuiClient;
import io.github.cottonmc.cotton.gui.client.ScreenDrawing;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.widget.AbstractButtonWidget;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;

public class WButton extends WWidget {
	private Text label;
	protected int color = WLabel.DEFAULT_TEXT_COLOR;
	protected int darkmodeColor = WLabel.DEFAULT_TEXT_COLOR;
	
	private Runnable onClick;
	
	public WButton() {
		
	}
	
	public WButton(Text text) {
		this.label = text;
	}
	
	@Override
	public boolean canResize() {
		return true;
	}
	
	
	@Override
	public void paintForeground(int x, int y, int mouseX, int mouseY) {
		boolean hovered = (mouseX>=x && mouseY>=y && mouseX<x+getWidth() && mouseY<y+getHeight());
		int int_3 = 1; //1=regular. 2=hovered. 0=disabled.
		if (hovered) int_3 = 2;
		
		float px = 1/256f;
		float buttonLeft = 0 * px;
		float buttonTop = (46 + (int_3*20)) * px;
		int halfWidth = getWidth()/2;
		if (halfWidth>198) halfWidth=198;
		float buttonWidth = halfWidth*px;
		float buttonHeight = 20*px;
		
		float buttonEndLeft = (200-(getWidth()/2)) * px;
		
		ScreenDrawing.rect(AbstractButtonWidget.WIDGETS_LOCATION, x, y, getWidth()/2, 20, buttonLeft, buttonTop, buttonLeft+buttonWidth, buttonTop+buttonHeight, 0xFFFFFFFF);
		ScreenDrawing.rect(AbstractButtonWidget.WIDGETS_LOCATION, x+(getWidth()/2), y, getWidth()/2, 20, buttonEndLeft, buttonTop, 200*px, buttonTop+buttonHeight, 0xFFFFFFFF);
		
		if (label!=null) {
			boolean active = true;
			int color = 14737632;
			if (!active) {
				color = 10526880;
			} else if (hovered) {
				color = 16777120;
			}
			
			ScreenDrawing.drawCenteredWithShadow(label.asFormattedString(), x+(getWidth()/2), y+4, color); //LibGuiClient.config.darkMode ? darkmodeColor : color);
		}
		
		
		super.paintForeground(x, y, mouseX, mouseY);
	}
	
	
	@Override
	public void onClick(int x, int y, int button) {
		super.onClick(x, y, button);
		
		MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.master(SoundEvents.UI_BUTTON_CLICK, 1.0F));
		
		if (onClick!=null) onClick.run();
	}

	public void setOnClick(Runnable r) {
		this.onClick = r;
	}
}
