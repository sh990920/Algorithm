func solution(_ phone_number:String) -> String {
    var result: String = ""
    
    var len = phone_number.count
    var cnt: Int = 0
    for i in phone_number {
        if cnt < len - 4 {
            result += "*"
        } else {
            result += String(i)
        }
        cnt += 1
    }
    
    return result
}