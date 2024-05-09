import Foundation

func solution(_ s:String) -> Int {
    var str = s
    var result = 0
    var numDict = ["zero": "0", "one": "1", "two": "2", "three": "3", "four": "4", "five": "5", "six": "6", "seven": "7", "eight": "8", "nine": "9"]
    for i in numDict.keys {
        if str.contains(i) {
            str = str.replacingOccurrences(of: i, with: numDict[i]!)
        }
    }
    if let num = Int(str) {
        result = num
    }
    return result
}