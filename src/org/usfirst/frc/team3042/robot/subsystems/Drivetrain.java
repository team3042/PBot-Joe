package org.usfirst.frc.team3042.robot.subsystems;

import org.usfirst.frc.team3042.robot.RobotMap;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private static final int leftTalon = RobotMap.leftTalon;
	private static final int rightTalon = RobotMap.rightTalon;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	CANTalon leftMotor;
	CANTalon rightMotor;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public Drivetrain() {
    	rightMotor = new CANTalon(rightTalon);
    	leftMotor = new CANTalon(leftTalon);
    	rightMotor.changeControlMode(TalonControlMode.PercentVbus);
    	leftMotor.changeControlMode(TalonControlMode.PercentVbus);
    }
    public void setMotors(double leftPow, double rightPow) {
    	leftMotor.set(leftPow);
    	rightMotor.set(rightPow);
    }
}

