@file:JsModule("@material-ui/core/Slider")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface SliderProps: CommonMaterialProps {

    /**
     * One of:
     * 'regular'
     * 'dense'
     *
     * Default: 'regular'
     *
     * Description: The variant to use.
     */
    var variant: String

    /**
     * One of:
     * 'primary'
     * 'secondary'
     *
     * Default: 'primary'
     *
     * Description: The color of the component.
     */
    var color: String

    /**
     * Default: 0
     *
     * Description: The minimum allowed value of the slider. Should not be equal to max.
     */
    var min: Int

    /**
     * Default: 100
     *
     * Description: The maximum allowed value of the slider. Should not be equal to min.
     */
    var max: Int

    /**
     * Description: Callback function that is fired when the slider's value changed.
     */
    var onChange: (Event, Int) -> Unit

    /**
     * Description: Callback function that is fired when the mouseup is triggered.
     */
    var onChangeCommitted: (Event, Int) -> Unit

    /**
     * One of:
     *  - 'horizontal'
     *  - 'vertical'
     *
     *  Default: 'horizontal'
     *
     *  Description: The slider orientation.
     */
    var orientation: String

    /**
     * Description: A transformation function, to change the scale of the slider.
     */
    var scale: (Int) -> (Int)

    /**
     * Default: 1
     *
     * Description: The granularity with which the slider can step through values. (A "discrete" slider.)
     * The min prop serves as the origin for the valid values. We recommend (max - min) to be evenly divisible
     * by the step. When step is null, the thumb can only be slid onto marks provided with the marks prop.
     */
    var step: Int

    /**
     * One of:
     *  - 'normal'
     *  - 'inverted'
     *  - false
     *
     * Default: 'normal'
     *
     * Description: The track presentation:
     *  - normal the track will render a bar representing the slider value.
     *  - inverted the track will render a bar representing the remaining slider value.
     *  - false the track will render without a bar.
     */
    var track: Any

    /**
     * Description: The value of the slider. For ranged sliders, provide an array with two values.
     */
    var value: Int

    /**
     * One of:
     *  - auto
     *  - on
     *  - off
     *
     * Default: off
     *
     * Description: Controls when the value label is displayed:
     *   - auto the value label will display when the thumb is hovered or focused.
     *   - on will display persistently.
     *   - off will never display.
     */
    var valueLabelDisplay: String

    /**
     * Description: Marks indicate predetermined values to which the user can move the slider.
     * If true the marks will be spaced according the value of the step prop.
     * If an array, it should contain objects with value and an optional label keys.
     */
    var marks: Boolean

    /**
     * Description: The id of the element containing a label for the slider.
     */
    var ariaLabelledby: String
}

@JsName("default") // because it was exported as default
external val Slider : RClass<SliderProps>
