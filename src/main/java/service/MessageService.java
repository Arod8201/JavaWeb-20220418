package service;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MessageService {

	private String token = "uKEFAY58gIvZDB0FqA6A19r2tXwPTaSwNlMRuMWe9Qp";

	public int pushMessage(String content) {
		// 推播程序 ...
		// 設定發送位置
		String lineNotifyUrl = "https://notify-api.line.me/api/notify";
		int httpCode = 0;
		try {
			// 將要推送的訊息轉為 byte[] 並寫編碼
			byte[] postData = ("message=" + content).getBytes("UTF-8");
			// 建立 URL 物件
			URL url = new URL(lineNotifyUrl);
			// 建立 HttpURLConnection 連線物件
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoInput(true);
			conn.setRequestMethod("POST");
			// 定義授權 Header
			// Bearer 支援 TLS 進階版的 SSL 加密技術
			conn.setRequestProperty("Authorization", "Bearer " + token);
			conn.setUseCaches(false);
			// 發送並回應
			try (DataOutputStream oos = new DataOutputStream(conn.getOutputStream())) {
				oos.write(postData);
				oos.flush();
			}
			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				httpCode = conn.getResponseCode();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 回應碼
		return httpCode;
	}

}
