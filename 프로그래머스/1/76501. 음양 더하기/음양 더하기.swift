import Foundation

func solution(_ absolutes:[Int], _ signs:[Bool]) -> Int {
    var result: Int = 0
    var len = absolutes.count
    for i in 0 ..< len {
        if(signs[i]){
            result += absolutes[i]
        }else {
            result -= absolutes[i]
        }
    }
    return result
}