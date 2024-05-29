import Foundation

func solution(_ keymap:[String], _ targets:[String]) -> [Int] {
    var result = Array<Int>()
    var dict : [Character: Int] = [:]
    
    for i in keymap {
        var idx = 1
        for j in i {
            if dict[j] == nil {
                dict[j] = idx
            } else if dict[j]! > idx {
                dict[j] = idx
            }
            idx += 1
        }
    }
    
    for i in targets {
        var count = 0
        for j in i {
            if let num = dict[j] {
                count += num
            } else {
                count = -1
                break
            }
        }
        result.append(count)
    }
    
    return result
}