package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前を入力してださい")
	private String name;
	
	/** メールアドレス */
	@NotBlank(message = "メールアドレスを入力してください")
	@Email(message = "Eメールの形式が不正です")
	private String mailAddress;

	/** パスワード */
	@NotBlank(message = "パスワードを入力してください")
	private String password;

	/** パスワード */
	@NotBlank(message = "確認用パスワードを入力してください")
	private String confPass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfPass() {
		return confPass;
	}

	public void setConfPass(String confPass) {
		this.confPass = confPass;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", confPass=" + confPass + "]";
	}

}
