package io.github.cottonmc.cotton.gui.impl.client;

import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public final class NarrationMessages {
	public static final String ITEM_SLOT_TITLE_KEY = "widget.libgui.item_slot.narration.title";
	public static final String LABELED_SLIDER_TITLE_KEY = "widget.libgui.labeled_slider.narration.title";
	public static final Text SCROLL_BAR_TITLE = new TranslatableText("widget.libgui.scroll_bar.narration.title");
	public static final String SLIDER_MESSAGE_KEY = "widget.libgui.slider.narration.title";
	public static final Text SLIDER_USAGE = new TranslatableText("widget.libgui.slider.narration.usage");
	public static final String TAB_TITLE_KEY = "widget.libgui.tab.narration.title";
	public static final String TAB_POSITION_KEY = "widget.libgui.tab.narration.position";
	public static final String TEXT_FIELD_TITLE_KEY = "widget.libgui.text_field.narration.title";
	public static final String TEXT_FIELD_SUGGESTION_KEY = "widget.libgui.text_field.narration.suggestion";
	public static final String TOGGLE_BUTTON_NAMED_KEY = "widget.libgui.toggle_button.narration.named";
	public static final Text TOGGLE_BUTTON_OFF = new TranslatableText("widget.libgui.toggle_button.narration.off");
	public static final Text TOGGLE_BUTTON_ON = new TranslatableText("widget.libgui.toggle_button.narration.on");
	public static final String TOGGLE_BUTTON_UNNAMED_KEY = "widget.libgui.toggle_button.narration.unnamed";

	public static final class Vanilla {
		public static final Text BUTTON_USAGE_FOCUSED = new TranslatableText("narration.button.usage.focused");
		public static final Text BUTTON_USAGE_HOVERED = new TranslatableText("narration.button.usage.hovered");
		public static final Text COMPONENT_LIST_USAGE = new TranslatableText("narration.component_list.usage");
		public static final Text INVENTORY = new TranslatableText("container.inventory");
		public static final String SCREEN_POSITION_KEY = "narrator.position.screen";
		public static final Text HOTBAR = new TranslatableText("options.attack.hotbar");
	}
}
