func solution(_ n:Int) -> String {
    var result: String = ""
    for i in 1...n {
        if i % 2 == 0 {
            result += "박"
        }else {
            result += "수"
        }
    }
    return result
}