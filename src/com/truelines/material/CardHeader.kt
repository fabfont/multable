@file:JsModule("@material-ui/core/CardHeader")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface CardHeaderProps: CommonMaterialProps {

    /**
     * Description: The action to display in the card header.
     */
    var action: dynamic

    /**
     * Description: The Avatar for the Card Header.
     */
    var avatar: dynamic

    /**
     * Default: false
     *
     * Description: If true, subheader and title won't be wrapped by a Typography component.
     * This can be useful to render an alternative Typography variant by wrapping the title text,
     * and optional subheader text with the Typography component.
     */
    var disableTypography: Boolean

    /**
     * Description: The content of the component.
     */
    var subheader: dynamic

    /**
     * Description: These props will be forwarded to the subheader (as long as disableTypography is not true).
     */
    var subheaderTypographyProps: dynamic

    /**
     * Description: The content of the Card Title.
     */
    var title: dynamic

    /**
     * Description: These props will be forwarded to the title (as long as disableTypography is not true).
     */
    var titleTypographyProps: dynamic
}

@JsName("default") // because it was exported as default
external val CardHeader : RClass<CardHeaderProps>
