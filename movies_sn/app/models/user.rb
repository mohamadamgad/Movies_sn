class User < ActiveRecord::Base

	validates :email , presence: true
	validates :first_name , presence: true

	has_many :friend
	has_many :post
	has_many :comment
	has_many :movie
end
