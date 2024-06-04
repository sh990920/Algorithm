import Foundation

func solution(_ survey:[String], _ choices:[Int]) -> String {
    var result = ""
    var dict = ["R" : 0, "T" : 0, "C" : 0, "F" : 0, "J" : 0, "M" : 0, "A" : 0, "N" : 0]
    let count = survey.count
    for i in 0..<count {
        var str = Array(survey[i])
        var a = str[0]
        var b = str[1]
        var num = choices[i]
        if num == 4 {
            continue
        } else if num > 4 {
            dict[String(b)]! += num - 4
        } else {
            dict[String(a)]! += 4 - num
        }
    }
    
    if dict["T"]! > dict["R"]! {
        result.append("T")
    } else {
        result.append("R")
    }
    if dict["F"]! > dict["C"]! {
        result.append("F")
    } else {
        result.append("C")
    }
    if dict["M"]! > dict["J"]! {
        result.append("M")
    } else {
        result.append("J")
    }
    if dict["N"]! > dict["A"]! {
        result.append("N")
    } else {
        result.append("A")
    }
    
    return result
}