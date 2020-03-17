@file:JsModule("@material-ui/core/Button")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface ButtonProps: CommonMaterialProps {

    /**
     * Action performed on button click
     */
    var onClick: (Event)->Unit

    /**
     * One of:
     * 'default'
     * 'inherit'
     * 'primary'
     * 'secondary'
     *
     * Default: 'default'
     *
     * Description: The color of the component. It supports those theme colors that make sense for this component.
     */
    var color: String

    /**
     * Description: The variante to use
     */
    var variant: String

    var href: String

    /**
     * One of:
     *  - 'submit'
     *  - 'reset'
     *  - 'button'
     *
     * Default, 'button'
     *
     * Description: the button type
     */
    var type: String

    /**
     * One of:
     * 'small'
     * 'medium'
     *
     * Default: 'medium'
     *
     * Description: The size of the button. small is equivalent to the dense button styling.
     */
    var size: String

    /**
     * Default: 'false'
     *
     * Description: If true, the button will be disabled.
     */
    var disabled: Boolean

    /**
     * Default: 'false'
     *
     * Description: If true, the keyboard focus ripple will be disabled. disableRipple must also be true.
     */
    var disableFocusRipple: Boolean

    /**
     * Default: 'false'
     *
     * Description: If true, the ripple effect will be disabled.
     */
    var disableRipple: Boolean

    var autoFocus: Boolean

    var focusRipple: Boolean

    var onKeyDown: (Event)->Unit

    var onMouseOver: (Event) -> Unit
    var onMouseOut: (Event) -> Unit
}

@JsName("default") // because it was exported as default
external val Button : RClass<ButtonProps>

