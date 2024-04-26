func solution(_ s:String) -> String {
    var result: String = s
    var charArr = Array<Character>()
    for i in s {
        charArr.append(i)
    } 
    charArr.sort(by: >)
    result = String(charArr)
    return result
}