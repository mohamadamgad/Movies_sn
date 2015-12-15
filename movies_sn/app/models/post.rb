class Post < ActiveRecord::Base

	validates :content, presence: true

	has_one :user
	has_many :comment
	has_one :movie
end
