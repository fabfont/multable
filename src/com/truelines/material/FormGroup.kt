@file:JsModule("@material-ui/core/FormGroup")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface FormGroupProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: Display group of elements in a compact row.
     */
    var row: Boolean

}

@JsName("default") // because it was exported as default
external val FormGroup : RClass<FormGroupProps>
