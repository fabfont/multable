@file:JsModule("@material-ui/core/Chip")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface ChipProps: CommonMaterialProps {

    /**
     * One of:
     * 'default'
     * 'outlined'
     *
     * Default: 'default'
     *
     * Description: The variant to use.
     */
    var variant: String

    /**
     * Description: Avatar element.
     */
    var avatar: dynamic

    /**
     * Description: If true, the chip will appear clickable, and will raise when pressed, even if the onClick prop is
     * not defined. If false, the chip will not be clickable, even if onClick prop is defined.
     * This can be used, for example, along with the component prop to indicate an anchor Chip is clickable.
     */
    var clickable: Boolean

    /**
     * One of:
     *   - 'default'
     *   - 'primary'
     *   - 'secondary'
     *
     * Default: 'default'
     *
     * Description: The color of the component. It supports those theme colors that make sense for this component.
     */
    var color: String

    /**
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: dynamic

    /**
     * Description: Override the default delete icon element. Shown only if onDelete is set.
     */
    var deleteIcon: dynamic

    /**
     * Default: false
     *
     * Description: If true, the chip should be displayed in a disabled state.
     */
    var disabled: Boolean

    /**
     * Description: Icon element.
     */
    var icon: dynamic

    /**
     * Description: The content of the label.
     */
    var label: String

    /**
     * Description: Callback function fired when the delete icon is clicked. If set, the delete icon will be shown.
     */
    var onDelete: () -> Unit

    /**
     * One of:
     *   - 'small'
     *   - 'medium'
     *
     * Default: 'medium'
     *
     * Description: The size of the chip.
     */
    var size: String

    /**
     * Action performed when clicking on the typography
     */
    var onClick: (Event) -> Unit

    /**
     * Action performed when double-clicking on the typography
     */
    var onDoubleClick: (Event) -> Unit

    /**
     * Callback performed on right-click
     */
    var onContextMenu: (Event) -> Unit

}

@JsName("default") // because it was exported as default
external val Chip : RClass<ChipProps>
