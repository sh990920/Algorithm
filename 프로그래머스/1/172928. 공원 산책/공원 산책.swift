import Foundation

func solution(_ park:[String], _ routes:[String]) -> [Int] {
    let area = park.map { Array($0) }
    var x = 0
    var y = 0
    for (idx, str) in park.enumerated() {
        if str.contains("S") {
            y = idx
            for (index, j) in str.enumerated() {
                if Character("S") == j {
                    x = index
                }
            }
        }
    }
    for i in routes {
        var route = i.components(separatedBy: " ")
        var num = Int(route[1])!
        var x_index = x
        var y_index = y
        for j in 0..<num {
            switch route[0] {
            case "E":
                x_index += 1
            case "W":
                x_index -= 1
            case "S":
                y_index += 1
            case "N":
                y_index -= 1
            default:
                break
            }
            if x_index >= 0 && x_index < area[0].count && y_index >= 0 && y_index < area.count {
                if area[y_index][x_index] == "X" {
                    break
                }
                if j == num - 1 {
                    x = x_index
                    y = y_index
                }
            }
        }   
    }
    return [y, x]
}