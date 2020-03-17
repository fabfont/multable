@file:JsModule("@material-ui/core/Typography")
@file:JsNonModule
package com.truelines.material


import org.w3c.dom.events.Event
import react.RClass


external interface TypographyProps: CommonMaterialProps {

    /**
     * One of:
     * 'inherit'
     * 'left'
     * 'center'
     * 'right'
     * 'justify'
     *
     * Default: 'inherit'
     *
     * Description: Set the text-align on the component.
     */
    var align: String

    /**
     * One of:
     * 'h1'
     * 'h2'
     * 'h3'
     * 'h4'
     * 'h5'
     * 'h6'
     * 'subtitle1'
     * 'subtitle2'
     * 'body1'
     * 'body2'
     * 'caption'
     * 'button'
     * 'overline'
     * 'srOnly'
     * 'inherit'
     *
     * Default: 'body1'
     *
     * Description: Applies the theme typography styles.
     */
    var variant: String

    /**
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     * By default, it maps the variant to a good default headline component.
     */
    var component: String

    /**
     * One of:
     * 'initial'
     * 'inherit'
     * 'primary'
     * 'secondary'
     * 'textPrimary'
     * 'textSecondary'
     * 'error'
     *
     * Default: 'initial'
     *
     * Description: The color of the component. It supports those theme colors that make sense for this component.
     */
    var color: String

    /**
     * One of:
     * 'initial'
     * 'block'
     * 'inline'
     *
     * Default: 'initial'
     *
     * Description: Controls the display type
     */
    var display: String

    /**
     * Default: 'false'
     *
     * Description: If true, the text will have a bottom margin.
     */
    var gutterBottom: Boolean

    /**
     * Default: 'false'
     *
     * Description: If true, the text will not wrap, but instead will truncate with a text overflow ellipsis.
     * Note that text overflow can only happen with block or inline-block level elements
     * (the element needs to have a width in order to overflow).
     */
    var noWrap: Boolean

    /**
     * Default: 'false'
     *
     * Description: If true, the text will have a bottom margin.
     */
    var paragraph: Boolean

    /**
     * Action performed when clicking on the typography
     */
    var onClick: (Event) -> Unit

    /**
     * Action performed when double-clicking on the typography
     */
    var onDoubleClick: (Event) -> Unit
}

@JsName("default") // because it was exported as default
external val Typography : RClass<TypographyProps>
