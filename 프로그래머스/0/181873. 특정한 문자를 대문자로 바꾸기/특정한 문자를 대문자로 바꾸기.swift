import Foundation

func solution(_ my_string:String, _ alp:String) -> String {
    var str = my_string
    str = str.replacingOccurrences(of: alp, with: alp.uppercased())
    return str
}