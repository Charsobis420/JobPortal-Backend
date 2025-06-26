package com.jobportal.utility;

public class Data {
	public static String getMessageBody(String otp, String name) {
		 return "<!DOCTYPE html>" +
                 "<html lang=\"en\">" +
                 "<head>" +
                 "<meta charset=\"UTF-8\">" +
                 "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                 "<title>OTP Email</title>" +
                 "<style>" +
                 "body { font-family: Arial, sans-serif; background-color: #f4f7fc; color: #333; margin: 0; padding: 0; }" +
                 ".email-container { width: 100%; max-width: 600px; margin: 0 auto; background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); }" +
                 ".email-header { text-align: center; margin-bottom: 30px; }" +
                 ".email-header h1 { color: #4CAF50; margin: 0; font-size: 24px; }" +
                 ".email-body { font-size: 16px; line-height: 1.5; }" +
                 ".otp { display: block; margin-top: 20px; font-size: 24px; font-weight: bold; color: #4CAF50; text-align: center; padding: 10px; background-color: #f4f7fc; border-radius: 5px; }" +
                 ".footer { margin-top: 30px; font-size: 12px; text-align: center; color: #888; }" +
                 ".footer a { color: #4CAF50; text-decoration: none; }" +
                 "</style>" +
                 "</head>" +
                 "<body>" +
                 "<div class=\"email-container\">" +
                 "<div class=\"email-header\">" +
                 "<h1>Your OTP Code</h1>" +
                 "</div>" +
                 "<div class=\"email-body\">" +
                 "<p>Dear " + name + ",</p>" +
                 "<p>Thank you for requesting a One-Time Password (OTP) for your account. Please use the following code to complete your request:</p>" +
                 "<div class=\"otp\">" +
                 otp +
                 "</div>" +
                 "<p>This OTP is valid for the next 10 minutes. If you didn't request this OTP, please disregard this email.</p>" +
                 "<p>If you need further assistance, feel free to contact our support team.</p>" +
                 "</div>" +
                 "<div class=\"footer\">" +
                 "<p>Best regards,<br>JobHook</p>" +
                 "<p><a href=\"https://yourcompany.com/support\">Contact Support</a> | <a href=\"https://yourcompany.com/terms\">Terms of Service</a></p>" +
                 "</div>" +
                 "</div>" +
                 "</body>" +
                 "</html>";
	}
}
