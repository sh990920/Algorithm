import Foundation

func solution(_ s:String) -> [Int] {
    var resDict = Dictionary<Character, Int>()
    var result = Array<Int>()
    for (idx, char) in s.enumerated() {
        if resDict.keys.contains(char) {
            result.append(idx - resDict[char]!)
        } else {
            result.append(-1)
        }
        resDict[char] = idx
    }
    return result
}