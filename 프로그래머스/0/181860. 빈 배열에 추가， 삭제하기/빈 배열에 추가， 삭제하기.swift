import Foundation

func solution(_ arr:[Int], _ flag:[Bool]) -> [Int] {
    var X = Array<Int>()
    
    for (idx, isTrue) in flag.enumerated() {
        if isTrue {
            for j in 1...(arr[idx] * 2){
                X.append(arr[idx])
            }
        } else {
            for j in 1...arr[idx] {
                X.remove(at: X.count - 1)
            }
        }
    }
    return X
}