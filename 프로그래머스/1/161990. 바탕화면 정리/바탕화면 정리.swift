import Foundation

func solution(_ wallpaper:[String]) -> [Int] {
    var (lux, luy) = (50, 50)
    var (rdx, rdy) = (-1, -1)
    
    for (i, str) in wallpaper.enumerated() {
        if str.contains("#") {
            lux = min(lux, i)
            rdx = max(rdx, i)
        }
        for (j, char) in str.enumerated() {
            if char == "#" {
                luy = min(luy, j)
                rdy = max(rdy, j)
            }
        }
        
    }
    
    return [lux, luy, rdx + 1, rdy + 1]
}