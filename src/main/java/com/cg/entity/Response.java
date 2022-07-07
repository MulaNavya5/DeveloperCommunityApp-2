package com.cg.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


	@Entity
	public class Response {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int respId;

		
		@Column(name="answer")
		private String answer;
		
		@Column
		@JsonFormat(pattern="yyyy-MM-dd")
		private LocalDate respDate;

		@Column
		@JsonFormat(pattern="HH:MM")
		private LocalTime respTime;
		
		@Column(name="accuracy")
		private int accuracy;
		
		public Response() {}
		public Response(int respId,String answer, LocalDate respDate, LocalTime respTime, int accuracy) {
			super();
			this.respId = respId;
			this.answer = answer;
			this.respDate = respDate;
			this.respTime = respTime;
			this.accuracy = accuracy;
		}
		public int getRespId() {
			return respId;
		}
		public void setRespId(int respId) {
			this.respId = respId;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public LocalDate getRespDate() {
			return respDate;
		}
		public void setRespDate(LocalDate respDate) {
			this.respDate = respDate;
		}
		public LocalTime getRespTime() {
			return respTime;
		}
		public void setRespTime(LocalTime respTime) {
			this.respTime = respTime;
		}
		public int getAccuracy() {
			return accuracy;
		}
		public void setAccuracy(int accuracy) {
			this.accuracy = accuracy;
		}
		@Override
		public String toString() {
			return "Response [respId=" + respId + ", answer=" + answer + ", respDate=" + respDate + ", respTime=" + respTime
					+ ", accuracy=" + accuracy + "]";
		}
		
			
		}
			
		
		

		


