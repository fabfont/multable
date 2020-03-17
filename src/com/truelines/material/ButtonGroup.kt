@file:JsModule("@material-ui/core/ButtonGroup")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface ButtonGroupProps: CommonMaterialProps {

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
     * Default: 'div'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    /**
     * Description: The variante to use
     */
    var variant: String

    /**
     * Default: 'false'
     *
     * Description: If true, the button will be disabled.
     */
    var disable: Boolean

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

    /**
     * One of:
     * 'small'
     * 'medium'
     * 'large'
     *
     * Default: 'medium'
     *
     * Description: The size of the button. small is equivalent to the dense button styling.
     */
    var size: String

    /**
     * Default: false
     *
     * Description: If true, the buttons will take up the full width of its container.
     */
    var fullWidth: Boolean
}

@JsName("default") // because it was exported as default
external val ButtonGroup : RClass<ButtonGroupProps>

