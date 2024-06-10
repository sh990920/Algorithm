func solution(_ s:String) -> String {
    var answer = ""
    var tmp = ""
    for letter in s {
        var letter = String(letter)
        if letter == " " {
            answer += tmp
            tmp = ""
            answer += letter
        } else {
            if tmp == "" {
                tmp += letter.uppercased()
            } else {
                tmp += letter.lowercased()
            }
        }
    }
    answer += tmp
    return answer
}