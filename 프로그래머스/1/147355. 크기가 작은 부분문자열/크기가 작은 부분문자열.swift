import Foundation

func solution(_ t:String, _ p:String) -> Int {
    var result = 0

    var tSize = t.count
    var pSize = p.count

    for i in 0...tSize - pSize {
        let start = t.index(t.startIndex, offsetBy: i)
        let end = t.index(t.startIndex, offsetBy: i + pSize - 1)
        var str = t[start...end]
        if let num = Int64(str) {
            if num <= Int64(p)! {
                result += 1
            }
        }
    }
    return result
}