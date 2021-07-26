function energy(number) {

    var service = 8.19
    var vat7 = 7

    if (number == 0) {
        vat7 = 0
        service = 0
    } 
    
    //first
    if (number>=15) {
        var first = 15
        document.getElementById("15_1").innerHTML = 15
    } else if (number >=1 && number <= 15){
        first = number
        document.getElementById("15_1").innerHTML = number
    } else {
        first = 0
        document.getElementById("15_1").innerHTML = 0
    }
    first = 2.3488 * first
    document.getElementById("result_15_1").innerHTML = first.toFixed(2)

    //second
    if (number<16) {
        var second = 0
        document.getElementById("10_2").innerHTML = 0
    } else if (number>=16 && number <=25){
        second = number-15
        document.getElementById("10_2").innerHTML = second
    } else if (number >25) {
        second = 10
        document.getElementById("10_2").innerHTML = second
    } else {
        second = 0
        document.getElementById("10_2").innerHTML = 0
    }
    second = 2.9882 * second
    document.getElementById("result_10_2").innerHTML = second.toFixed(2)

    //third
    if (number<26) {
        var third = 0
        document.getElementById("10_3").innerHTML = 0
    } else if (number>=26 && number <=35){
        third = number-25
        document.getElementById("10_3").innerHTML = third
    } else if (number >35) {
        third = 10
        document.getElementById("10_3").innerHTML = third
    } else {
        third = 0
        document.getElementById("10_3").innerHTML = third
    }
    third = 3.2405 * third
    document.getElementById("result_10_3").innerHTML = third.toFixed(2)

    //forth
    if (number<36) {
        var forth = 0
        document.getElementById("65_4").innerHTML = 0
    } else if (number>=36 && number <=100){
        forth = number-35
        document.getElementById("65_4").innerHTML = forth
    } else if (number >100) {
        forth = 65
        document.getElementById("65_4").innerHTML = forth
    }else {
        forth = 0
        document.getElementById("65_4").innerHTML = 0
    }
    forth = 3.6237 * forth
    document.getElementById("result_65_4").innerHTML = forth.toFixed(2)

    //fifth
    if (number<101) {
        var fifth = 0
        document.getElementById("50_5").innerHTML = 0
    } else if (number>=101 && number <=150){
        fifth = number-100
        document.getElementById("50_5").innerHTML = fifth
    } else if (number >150) {
        fifth = 50
        document.getElementById("50_5").innerHTML = fifth
    }else {
        fifth = 0
        document.getElementById("50_5").innerHTML = 0
    }
    fifth = 3.7171 * fifth
    document.getElementById("result_50_5").innerHTML = fifth.toFixed(2)

    //sixth
    if (number<151) {
        var sixth = 0
        document.getElementById("50_6").innerHTML = 0
    } else if (number>=151 && number <=400){
        sixth = number-150
        document.getElementById("50_6").innerHTML = sixth
    } else if (number >400) {
        sixth = 250
        document.getElementById("50_6").innerHTML = sixth
    }else {
        sixth = 0
        document.getElementById("50_6").innerHTML = 0
    }
    sixth = 4.2218 * sixth
    document.getElementById("result_50_6").innerHTML = sixth.toFixed(2)

    //seventh
    if (number<400) {
        var seventh = 0
        document.getElementById("400_7").innerHTML = 0
    } else if (number >400) {
        seventh = number-400
        document.getElementById("400_7").innerHTML = seventh
    }else {
        seventh = 0
        document.getElementById("400_7").innerHTML = 0
    } 
    seventh = 4.4217 * seventh
    document.getElementById("result_400_7").innerHTML = seventh.toFixed(2)

    var result = first + second + third + forth + fifth + sixth + seventh
    document.getElementById("energy1_result").innerHTML = result.toFixed(2)



    var ft = number * -0.1243
    document.getElementById("ft_result").innerHTML = ft.toFixed(2)
    var vat = ((result + service + ft) * vat7 ) / 100
    document.getElementById("vat_result").innerHTML = vat.toFixed(2)

    var allresult = result + service + ft + vat
    document.getElementById("result_all").innerHTML = allresult.toFixed(2)
}
