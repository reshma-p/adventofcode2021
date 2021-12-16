//
//  main.swift
//  adventofcode2021
//
//  Created by Reshma Pinto on 16/12/2021.
//

import Foundation


func main() {
    day1Puzzle()
}


func day1Puzzle() {
    let increasedMeasurements = checkIncreasedMeasurement(measurements: array)
    print("\n Puzzle 1 answer - \(increasedMeasurements)")

    let slidingMeasurements = addingUpThreeMeasurementSlidingWindow(measurements: array)
    let slidingIncreasedMeasurements = checkIncreasedMeasurement(measurements: slidingMeasurements)
    print("\n Puzzle 2 answer - \(slidingIncreasedMeasurements)")
}

main()
