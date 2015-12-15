class Comment < ActiveRecord::Base

	validates :comment, presence: true

	has_one :user
	has_one :post
end
