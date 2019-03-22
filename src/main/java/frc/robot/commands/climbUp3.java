/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class climbUp3 extends CommandGroup {
  /**
   * Add your docs here.
   */
  public climbUp3() {
    addSequential(new liftRobotRear3());
    addParallel(new liftRobotRear3());
    addParallel(new candyCaneDriveOn3());
    addParallel(new liftDriveOn3());
    addSequential(new liftRobotFront3());
    addParallel(new candyCaneDriveOn3(), 8);
    addSequential(new liftDriveOn3(), 8);
    addParallel(new liftArmsUp3());
 
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
