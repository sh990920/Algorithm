import Foundation

func solution(_ s:String) -> String {
    var result = ""
    
    var strArr = s.components(separatedBy: " ")
    
    var arr = Array<Int>()
    
    for i in strArr {
        if let num = Int(i) {
            arr.append(num)
        }
    }
    
    arr.sort()
    
    var min = String(arr[0])
    var max = String(arr[arr.count - 1])
    
    result.append(min)
    result.append(" ")
    result.append(max)
    
    return result
}