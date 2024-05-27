import Foundation

func solution(_ X:String, _ Y:String) -> String {
    var result = ""
    
    var xArr = [0,0,0,0,0,0,0,0,0,0]
    var yArr = [0,0,0,0,0,0,0,0,0,0]
    
    for i in X {
        if let num = Int(String(i)) {
            xArr[num] += 1
        }
    }
    
    for i in Y {
        if let num = Int(String(i)) {
            yArr[num] += 1
        }
    }
    
    var resultArr = Array<Int>()
    
    for i in 0...9 {
        if xArr[i] > yArr[i] {
            resultArr.append(yArr[i])
        } else {
            resultArr.append(xArr[i])
        }
    }
    
    for i in stride(from: 9, through: 0, by: -1) {
        for j in stride(from: 0, to: resultArr[i], by: 1) {
            result += String(i)
        }
    }
    
    if result == "" {
        result = "-1"
    }else if result.replacingOccurrences(of: "0", with: "") == "" {
        result = "0"
    }
    
    return result
}