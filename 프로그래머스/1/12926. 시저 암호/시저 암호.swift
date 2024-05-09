func solution(_ s:String, _ n:Int) -> String {
    var result: String = ""
    var num:UInt32 = UInt32(n)
    for char in s.utf8 {
        var asciiCode = UInt32(char)
        if char == 32 {
            result.append(" ")
            continue
        } else if char >= 65 && char <= 90 {
            asciiCode = ((asciiCode - 65 + num) % 26) + 65
        } else if char >= 97 && char <= 122 {
            asciiCode = ((asciiCode - 97 + num) % 26) + 97
        }
        result.append(Character(Unicode.Scalar(asciiCode)!))
    }
    return result
}