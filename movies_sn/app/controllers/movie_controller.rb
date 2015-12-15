class MovieController < ApplicationController

	def index
		@movies = Movie.all
	end

	def create 
		@movie = Movie.new
	end
end
