
const check = () => {

    var b1 = document.getElementById("b1").value
    var b2 = document.getElementById("b2").value
    var p1 = document.getElementById("p1").value
    var p2 = document.getElementById("p2").value
    var k1 = document.getElementById("k1").value
    var k2 = document.getElementById("k2").value

    if (b1 == '') {
        document.getElementById("b1").value = ((b2 * p2 * k1) / (k2 * p1)).toFixed(2)
        document.getElementById("b1").style.color = "red"
    } else if (b2 == '') {
        document.getElementById("b2").value = ((b1 * p1 * k2) / (k1 * p2)).toFixed(2)
        document.getElementById("b2").style.color = "red"
    } else if (p1 == '') {
        document.getElementById("p1").value = ((b2 * p2 * k1) / (k2 * b1)).toFixed(2)
        document.getElementById("p1").style.color = "red"
    } else if (p2 == '') {
        document.getElementById("p2").value = ((b1 * p1 * k2) / (k2 * b2)).toFixed(2)
        document.getElementById("p2").style.color = "red"
    } else if (k1 == '') {
        document.getElementById("k1").value = ((b1 * p1 * k2) / (b2 * p2)).toFixed(2)
        document.getElementById("k1").style.color = "red"
    } else if (k2 == '') {
        document.getElementById("k2").value = ((b2 * p2 * k1) / (b1 * p1)).toFixed(2)
        document.getElementById("k2").style.color = "red"
    }
}

const reset = () => {
    document.getElementById("b1").value = ''
    document.getElementById("b1").style.color = "black"

    document.getElementById("b2").value = ''
    document.getElementById("b2").style.color = "black"

    document.getElementById("p1").value = ''
    document.getElementById("p1").style.color = "black"

    document.getElementById("p2").value = ''
    document.getElementById("p2").style.color = "black"

    document.getElementById("k1").value = ''
    document.getElementById("k1").style.color = "black"

    document.getElementById("k2").value = ''
    document.getElementById("k2").style.color = "black"
}

const cColor = () => {

    document.getElementById("b1").style.color = "black"
    document.getElementById("b2").style.color = "black"
    document.getElementById("p1").style.color = "black"
    document.getElementById("p2").style.color = "black"
    document.getElementById("k1").style.color = "black"
    document.getElementById("k2").style.color = "black"
}