class Friend < ActiveRecord::Base

	validates :user_email1 , presence: true
	validates :user_email2 ,presence: true


end
