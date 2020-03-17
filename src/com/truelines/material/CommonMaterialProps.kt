package com.truelines.material

import react.RProps

external interface CommonMaterialProps: RProps {
    /**
     * CSS class name
     */
    var className : String

    /**
     * CSS style
     */
    var style: dynamic

    /**
     * Element id
     */
    var id: String

    /**
     * Key property
     */
    var key: String
}