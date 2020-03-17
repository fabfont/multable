@file:JsModule("@material-ui/core/Link")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface LinkProps: CommonMaterialProps {

    /**
     * Default: 'inherit'
     *
     * Description: Applies the theme typography styles.
     */
    var variant: String

    /**
     * One of:
     *  - 'default'
     *  - 'error'
     *  - 'inherit'
     *  - 'primary'
     *  - 'secondary'
     *  - 'textPrimary'
     *  - 'textSecondary'
     *
     * Default: 'primary'
     *
     * Description: The color of the link.
     */
    var color: String

    /**
     * Default: 'a'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     * ⚠️ Needs to be able to hold a ref.
     */
    var component: String

    /**
     * Description: classes prop applied to the Typography element.
     */
    var TypographyClasses: dynamic

    /**
     * One of:
     *  - 'none'
     *  - 'hover'
     *  - 'always'
     *
     * Default: 'hover'
     *
     * Description: Controls when the link should have an underline.
     */
    var underline: String

    /**
     * Description: callback performed when clicking
     */
    var onClick: (Event) -> Unit

}

@JsName("default") // because it was exported as default
external val Link : RClass<LinkProps>
