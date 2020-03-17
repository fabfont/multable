@file:JsModule("@material-ui/core/CardMedia")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface CardMediaProps: CommonMaterialProps {
    /**
     * Description: Image to be displayed as a background image. Either image or src prop must be specified. Note that
     * caller must specify height otherwise the image will not be visible.
     */
    var image: String

    /**
     * Description: An alias for image property. Available only with media components.
     * Media components: video, audio, picture, iframe, img.
     */
    var src: String

    /**
     * Default: 'div'
     *
     * Description: Component for rendering image. Either a string to use a DOM element or a component.
     */
    var component: String

    /**
     * Description: alternative attribute for img component
     */
    var alt: String

    /**
     * Description: height attribute for img component
     */
    var height: String

    /**
     * Description: width attribute for img component
     */
    var width: String

    /**
     * Description: title attribute for img component
     */
    var title: String

}

@JsName("default") // because it was exported as default
external val CardMedia : RClass<CardMediaProps>
