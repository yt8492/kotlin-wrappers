import kotlinx.css.borderWidth
import kotlinx.css.px
import kotlinx.html.js.onChangeFunction
import org.w3c.dom.HTMLTextAreaElement
import react.RProps
import react.child
import react.dom.div
import react.dom.render
import react.functionalComponent
import react.useState
import styled.css
import styled.styledTextArea
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        child(component)
    }
}

val component = functionalComponent<RProps> {
    val (inputText, setText) = useState("")
    styledTextArea {
        css {
            borderWidth = 3.px
        }
        attrs.onChangeFunction = {
            val target = it.target as HTMLTextAreaElement
            setText.invoke(target.value)
        }
    }
    div {
        + inputText
    }
}
