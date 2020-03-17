@file:JsModule("@material-ui/core/Checkbox")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass
import react.RRef


external interface CheckboxProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: If true, the component is checked.
     */
    var checked: Boolean

    /**
     * Default: <CheckBoxIcon />
     *
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
     * Default: false
     *
     * Description: If true, the ripple effect will be disabled.
     */
    var disableRipple: Boolean

    /**
     * Default: <CheckBoxOutlineBlankIcon />
     *
     * Description: The icon to display when the component is unchecked.
     */
    var icon: dynamic

    /**
     * Default: false
     *
     * Description: If true, the component appears indeterminate. This does not set the native input element to
     * indeterminate due to inconsistent behavior across browsers. However, we set a data-indeterminate attribute
     * on the input.
     */
    var indeterminate: Boolean

    /**
     * Default: <IndeterminateCheckBoxIcon />
     *
     * Description: The icon to display when the component is indeterminate.
     */
    var indeterminateIcon: dynamic

    /**
     * Description: Props of the under input element
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
     * Description: The size of the checkbox. small is equivalent to the dense checkbox styling.
     */
    var size: String

    /**
     * Description: The input component prop type.
     */
    var type: String

    /**
     * Description: The value of the component. The DOM API casts this to a string.
     */
    var value: Any
}

@JsName("default") // because it was exported as default
external val Checkbox : RClass<CheckboxProps>
