/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class deployRobot extends CommandGroup {
  
  /**
   * This command group is to be run after the robot climbs
   * down from the habitat in preparation for the match.
   * 
   * It moves the boom into the starting position (including the needed wrist
   * adjustments) and starts the vacuum motor.
   * 
   * The command group can be assigned to a button or scheduled to run after the 
   * after the robot climbs down.
   */

  public deployRobot() {

    addParallel(new deployBoom());
    addParallel(new deployWrist());
    addParallel(new vacuumBegin());
    
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
