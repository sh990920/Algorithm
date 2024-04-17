func solution(_ seoul:[String]) -> String {
    var result = "김서방은 x에 있다"
    var idx = 0
    for i in 0 ... seoul.count - 1 {
        if(seoul[i] == "Kim"){
            idx = i
        }
    }
    result = result.replacingOccurrences(of: "x", with: String(idx))
    return result
}