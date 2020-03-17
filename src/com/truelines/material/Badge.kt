@file:JsModule("@material-ui/core/Badge")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface BadgeProps: CommonMaterialProps {

    /**
     * {
     *   horizontal: 'left' | 'right',
     *   vertical: 'bottom' | 'top'
     * }
     *
     * Default: { vertical: 'top', horizontal: 'right',}
     *
     * Description: The anchor of the badge.
     */
    var anchorOrigin: dynamic

    /**
     * Description: The content rendered within the badge.
     */
    var badgeContent: Int

    /**
     * Default: false
     *
     * Description: If true, the badge will be invisible.
     */
    var invisible: Boolean

    /**
     * One of:
     * 'default'
     * 'error'
     * 'primary'
     * 'secondary'
     *
     * Default: 'default'
     *
     * Description: The color of the component. It supports those theme colors that make sense for this component.
     */
    var color: String

    /**
     * Description: Max count to show.
     */
    var max: Int

    /**
     * One of:
     * 'circle'
     * 'rectangle'
     *
     * Default: 'rectangle'
     *
     * Description: Wrapped shape the badge should overlap.
     */
    var overlap: String

    /**
     * Default: false
     *
     * Description: Controls whether the badge is hidden when badgeContent is zero.
     */
    var showZero: Boolean

    /**
     * One of:
     * 'dot'
     * 'standard'
     *
     * Default: 'standard'
     *
     * Description: The variant to use
     */
    var variant: String
}

@JsName("default") // because it was exported as default
external val Badge : RClass<BadgeProps>
