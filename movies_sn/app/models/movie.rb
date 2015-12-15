class Movie < ActiveRecord::Base

	validates :name , presence: true
    validates :genre , presence: true
 
 	has_many :post
 	has_many :user

end
