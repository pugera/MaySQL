package com.maysql;

import java.util.List;

import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaysqlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MaysqlApplication.class, args);
		
		String str = "これは形態素解析のテストです"; // 形態素解析対象文字列

		 Tokenizer tokenizer = Tokenizer.builder().build(); // Kuromojiオブジェクト作成

		 List<Token> tokens = tokenizer.tokenize(str); // Tokenize

		 for (Token token : tokens) {
		 System.out.println("----------------------");
		 System.out.println("表層:" + token.getSurfaceForm()); // Tokenの表層

		 System.out.println("語幹:" + token.getBaseForm()); // Tokenの語幹

		 System.out.println("読み:" + token.getReading()); // Tokenの読み

		 System.out.println("POS:" + token.getAllFeatures()); // TokenのPOS詳細情報
	}
	}

}
