@file:JsModule("@material-ui/pickers")
@file:JsNonModule
package com.truelines.material

import react.RClass

external interface MuiPickersUtilsProviderProps: CommonMaterialProps {

    var utils: dynamic
}

@JsName("default") // because it was exported as default
external val MuiPickersUtilsProvider: RClass<MuiPickersUtilsProviderProps>

