func solution(_ s:String) -> String {
    var result = ""
    var len = s.count
    if len % 2 == 0 {
        var start = len / 2
        var end = start + 1
        let startIdx = s.index(s.startIndex, offsetBy: start - 1)
        let endIdx = s.index(s.startIndex, offsetBy: end)
        result = s.substring(with: startIdx..<endIdx)
    } else {
        len = (len - 1) / 2
        let sIdx = s.index(s.startIndex, offsetBy: len)
        result = String(s[sIdx])
    }
    return result
}