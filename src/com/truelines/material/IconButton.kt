/*
 *  Copyright (c) 2019 Leonard Management. All rights reserved.
 *
 *  This is an unpublished work of Leonard Management.
 *  It may not be used, copied, disclosed or transferred other than
 *  in accordance with the written permission of Leonard Management.
 */
@file:JsModule("@material-ui/core/IconButton")
@file:JsNonModule
package com.truelines.material


import react.RClass


external interface IconButtonProps: ButtonProps {


    /**
     * One of:
     * 'start'
     * 'end'
     * false
     *
     * Default: false
     *
     * Description: If given, uses a negative margin to counteract the padding on one side (this is often helpful for
     * aligning the left or right side of the icon with content above or below, without ruining the border size and
     * shape).
     */
    var edge: String

    /**
     * Description: Classes allow to override CSS-style
     */
    var classes: dynamic

}

@JsName("default") // because it was exported as default
external val IconButton : RClass<IconButtonProps>
