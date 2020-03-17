@file:JsModule("@material-ui/core/TextField")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.RRef


external interface TextFieldProps: CommonMaterialProps {

    /**
     * One of:
     *  - 'standard'
     *  - 'outlined'
     *  - 'filled'
     *
     *  Default: 'standard'
     *
     *  Description: The variant to use
     */
    var variant: String

    /**
     * Description: The label content
     */
    var label: String

    /**
     * Description: The helper text content.
     */
    var helperText: String

    /**
     * Description: Callback fired when the value is changed.
     */
    var onChange: (Event)->Unit

    /**
     * Description: The value of the input element, required for a controlled component.
     */
    var value: Any

    /**
     * Default: false
     *
     * Description: If true, the label will be displayed in an error state.
     */
    var error: Boolean

    /**
     * Default: false
     *
     * Description: If true, the input element will be focused during the first mount.
     */
    var autoFocus: Boolean

    /**
     * One of:
     *  - 'primary'
     *  - 'secondary'
     *
     * Default: 'primary'
     *
     * Description: The color of the component. It supports those theme colors that make sense for this component.
     */
    var color: String

    /**
     * Description: The default value of the input element.
     */
    var defaultValue: Any

    /**
     * Default: false
     *
     * Description: If true, the input element will be disabled.
     */
    var disabled: Boolean

    /**
     * Description: Props applied to the FormHelperText element.
     */
    var FormHelperTextProps: dynamic

    /**
     * Default: false
     *
     * Description: If true, the input will take up the full width of its container.
     */
    var fullWidth: Boolean

    /**
     * One of:
     *  - 'none'
     *  - 'dense'
     *  - 'normal'
     *
     * Description: If dense or normal, will adjust vertical spacing of this and contained components.
     */
    var margin: String

    /**
     * Default: false
     *
     * Description: If true, a textarea element will be rendered instead of an input.
     */
    var multiline: Boolean

    /**
     * Desscription: Name attribute of the input element.
     */
    var name: String

    /**
     * Description: The short hint displayed in the input before the user enters a value.
     */
    var placeholder: String

    /**
     * Default: false
     *
     * Description: If true, the label is displayed as required and the input element` will be required.
     */
    var required: Boolean

    /**
     * Description: Number of rows to display when multiline option is set to true.
     */
    var rows: Int

    /**
     * Description: Maximum number of rows to display when multiline option is set to true.
     */
    var rowsMax: Int

    /**
     * Default: false
     *
     * Description: Render a Select element while passing the Input element to Select as input parameter.
     * If this option is set you must pass the options of the select as children.
     */
    var select: Boolean

    /**
     * Description: Type of the input element. It should be a valid HTML5 input type.
     */
    var type: String

    /**
     * Description: Props of the under input element
     */
    var InputProps: dynamic

    /**
     * Description: Pass a ref to the input element.
     */
    var inputRef: RRef
}


external interface InputProps: RProps {
    var onClick: (Event) -> Unit
}

@JsName("default") // because it was exported as default
external val TextField : RClass<TextFieldProps>