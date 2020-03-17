@file:JsModule("@material-ui/core/Switch")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass
import react.RRef


external interface SwitchProps: CommonMaterialProps {

    /**
     * Description: If true, the component is checked.
     */
    var checked: Boolean

    /**
     * Description: The icon to display when the component is checked.
     */
    var checkedIcon: dynamic

    /**
     * One of:
     *  - 'primary'
     *  - 'secondary'
     *  - 'default'
     *
     * Default: 'secondary'
     *
     * Description: The color of the component. It supports those theme colors that make sense for this component.
     */
    var color: String

    /**
     * Default: false
     *
     * Description: If true, the switch will be disabled.
     */
    var disabled: Boolean

    /**
     * Description: If true, the ripple effect will be disabled.
     */
    var disableRipple: Boolean

    /**
     * One of:
     *  - 'start'
     *  - 'end'
     *  - false
     *
     * Default: false
     *
     * Description: If given, uses a negative margin to counteract the padding on one side (this is often helpful for
     * aligning the left or right side of the icon with content above or below, without ruining the border size and shape).
     */
    var edge: String

    /**
     * Description: The icon to display when the component is unchecked.
     */
    var icon: dynamic

    /**
     * Description: Attributes applied to the input element.
     */
    var inputProps: dynamic

    /**
     * Description: Pass a ref to the input element.
     */
    var inputRef: RRef

    /**
     * Description: Callback fired when the state is changed.
     */
    var onChange: (Event) -> Unit

    /**
     * Description: If true, the input element will be required.
     */
    var required: Boolean

    /**
     * One of:
     *  - 'small'
     *  - 'medium'
     *
     * Default: 'medium'
     *
     * Description: The size of the switch. small is equivalent to the dense switch styling.
     */
    var size: String

    /**
     * Description: The input component prop type.
     */
    var type: String

    /**
     * The value of the component. The DOM API casts this to a string.
     */
    var value: Any

}

@JsName("default") // because it was exported as default
external val Switch : RClass<SwitchProps>
